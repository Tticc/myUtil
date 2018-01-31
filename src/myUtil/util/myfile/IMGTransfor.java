package myUtil.util.myfile;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class IMGTransfor {

	public static void main(String[] args) throws IOException{
		String input = "D:\\trans\\005.jpg";
		String output = "D:\\trans\\007.jpg";
		transfor2JPEG(input,output,"jpg");
	}
	
	private static void transfor2JPEG(String input,String output,String targetFormat) throws IOException{
		BufferedImage bufferedImage;
		bufferedImage = ImageIO.read(new File(input));
		BufferedImage newBufferedImage = new BufferedImage(bufferedImage.getWidth(),
	            bufferedImage.getHeight(), BufferedImage.TYPE_INT_RGB);
		newBufferedImage.createGraphics().drawImage(bufferedImage, 0, 0, Color.WHITE, null);
		ImageIO.write(newBufferedImage, targetFormat, new File(output));
	}
	
	
	private static void transfor2JPG(String input,String output){
		//JPGOptions options = new JPGOptions();
	}
	
}
