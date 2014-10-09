import java.awt.Component;
import java.awt.Graphics;
import java.net.URL;

import javax.swing.ImageIcon;

public class ImageProxy extends Icon {
	ImageIcon imageIcon;
	URL imageURL;
	Thread retrievalThread;
	boolean retrieving = false;

	public ImageProxy(URL url) {
		imageURL = url;
	}

	public int getIconWidth() {
		if (imageIcon != null) {
			return imageIcon.getIconWidth();
		} else {
			return 600;
		}
	}

	public int getIconHeight() {
		if (imageIcon != null) {
			return imageIcon.getIconHeight();
		} else {
			return 800;
		}
	}

	public void paintIcon(final Component c, Graphics g, int x, int y) {

		if (imageIcon != null) {
			// we don't have it, let's paint it
			imageIcon.paintIcon(c, g, x, y);
		} else {
			// otherwise time for loading message
			g.drawString("Loading cover", x + 200, y + 100);

			if (!retrieving) {
				retrieving = true;
				// new thread otherwise the entire ui is hung up
				retrievalThread = new Thread(new Runnable() {

					@Override
					public void run() {
						try {
							imageIcon = new ImageIcon(imageURL, "");
							c.repaint();
						} catch (Exception ex) {
							ex.printStackTrace();
						}

					}
				});
				retrievalThread.start();
			}
		}

	}

}
