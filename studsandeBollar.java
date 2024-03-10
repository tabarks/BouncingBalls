//import inlämningsuppgift3.StdDraw;

public class studsandeBollar {
	private double x = 0, y = 0;

	private double vx = 1, vy = 2;
	private double rad = 0.05;
	private double G = 10;
	private double t = 0.008;

	public studsandeBollar() {
		StdDraw.setPenColor(StdDraw.PINK);
		StdDraw.circle(x, y, rad);
	}

	public void utanGravitation() {
		while (true) {
			StdDraw.clear(StdDraw.BLACK);
			if (x >= 1.0 - rad || x <= -1.0 + rad)
				vx = -vx;
			if (y >= 1.0 - rad || y <= -1.0 + rad)
				vy = -vy;
			x = x + t * vx;
			y = y + t * vy;

			StdDraw.setPenColor(StdDraw.PINK);
			StdDraw.circle(x, y, rad);
			StdDraw.show();
			StdDraw.pause(1);
		
		}
	}

	public void gravitation() {
		while (true) {
			StdDraw.clear(StdDraw.BLACK);

			  if (x>=1.0 -rad || x <=-1.0 + rad) vx = -vx;
	            if (y>=1.0 -rad || y <= -1.0 + rad) vy = -vy;
	            if (y >-1.0&& y < -1 +rad) {
	            	y=-1.0+rad;
	            	vx=vx*0.99;
	            }

	            // update position
	            x += t*vx; 
	            vy= vy- G*t;;
	            y+=t*vy-G*(t*t/2.0);

			StdDraw.setPenColor(StdDraw.PINK);
			StdDraw.circle(x, y, rad);
			StdDraw.show();
			StdDraw.pause(1);
		}

	}
}
