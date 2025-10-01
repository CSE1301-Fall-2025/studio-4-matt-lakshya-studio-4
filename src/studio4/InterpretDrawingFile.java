package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		String shape = in.next();
		int red = in.nextInt();
		int green = in.nextInt();
		int blue = in.nextInt();
		boolean filled = in.nextBoolean();
		double param1 = in.nextDouble();
		double param2 = in.nextDouble();
		double param3 = in.nextDouble();
		double param4 = in.nextDouble();
		
		StdDraw.setPenRadius(0.01);
		StdDraw.setPenColor(red, green, blue);
		if (shape.equals("triangle"))
		{
			double param5 = in.nextDouble();
			double param6 = in.nextDouble();
			double[] x = {param1, param3, param5};
   			double[] y = {param2, param4, param6};
			if(filled)
			{
				StdDraw.filledPolygon(x, y);
			}
			else
			{
				StdDraw.polygon(x, y);
			}
		}
		else if (shape.equals("rectangle"))
		{
			if (filled)
			{
				StdDraw.filledRectangle(param1, param2, param3, param4);
			}
			else
			{
				StdDraw.rectangle(param1, param2, param3, param4);
			}
		}
		else if (shape.equals("ellipse"))
		{
			if (filled)
			{
				StdDraw.filledEllipse(param1, param2, param3, param4);
			}
			else
			{
				StdDraw.ellipse(param1, param2, param3, param4);
			}
		}
		
        
		
	}
}
