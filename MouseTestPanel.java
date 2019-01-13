import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.JPanel;

public class MouseTestPanel extends JPanel implements MouseListener,
		MouseMotionListener {

	private static final int WIDTH = 200;
	private static final int HEIGHT = 200;

	// punkt, kt�ry b�dzie pami�ta� wsp�rz�dne przesuwanego kwadracika
	Point movingPoint;

	ArrayList<Point> points = new ArrayList<Point>();

	public MouseTestPanel() {
		//dodajemy s�uchaczy
		addMouseListener(this);
		addMouseMotionListener(this);
		setPreferredSize(new Dimension(WIDTH, HEIGHT));
	}

	@Override
	public void mouseClicked(MouseEvent e) {
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// wsp�rz�dne w kt�rych klikni�to
		int x1 = e.getX();
		int y1 = e.getY();
		// wsp�rz�dne kwadracik�w
		int x2, y2;

		// czy chcemy doda�, usun��, lub przesun��
		if (e.getButton() == MouseEvent.BUTTON3) {
			Point toRemove = null;
			for (Point p : points) {
				x2 = (int) p.getX();
				y2 = (int) p.getY();
				if (x1 >= x2 && y1 >= y2 && x1 <= x2 + 10 && y1 <= y2 + 10)
					toRemove = p;
			}
			// usuwamy kwadracik
			points.remove(toRemove);
		} else if (e.getButton() != MouseEvent.BUTTON3) {
			int index = 0;
			int size = points.size();
			Point p;
			while (movingPoint == null && index < size) {
				p = points.get(index);
				x2 = (int) p.getX();
				y2 = (int) p.getY();
				if (x1 >= x2 && y1 >= y2 && x1 <= x2 + 10 && y1 <= y2 + 10)
					movingPoint = p;
				index++;
			}
		}
		//je�eli nie klikni�to na �aden kwadracik
		if (movingPoint==null && e.getButton() == MouseEvent.BUTTON1) {
			x1 = e.getX();
			y1 = e.getY();
			// dodajemy kwadracik
			points.add(new Point(x1, y1));
		}

		repaint();
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		 movingPoint = null;
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		if (movingPoint != null) {
			movingPoint.x = e.getX();
			movingPoint.y = e.getY();
			repaint();
		}
	}

	@Override
	public void mouseMoved(MouseEvent e) {
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g); //wyczy�ci nasze t�o
		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(Color.WHITE); //ustawiamy t�o
		g2d.fillRect(0, 0, WIDTH, HEIGHT);
		g2d.setColor(Color.BLACK); //ustawiamy kolor kwadracik�w
		drawRectangles(g2d);
	}

	//metoda rysuj�ca kwadraciki
	private void drawRectangles(Graphics2D g2d) {
		int x, y;
		for (Point p : points) {
			x = (int) p.getX();
			y = (int) p.getY();
			g2d.fillRect(x, y, 10, 10);
		}
	}
}