package de.onke.ocr;

import net.sourceforge.tess4j.TesseractException;

public class Main {

	public static void main(final String[] args) throws TesseractException {

		final OcrHandler ocrHandler = new OcrHandler();
//		final String mockPath = "\\\\mortimer\Workspaces\cedric.maubach\Allgemeines\privates Projekt\images\\TestHp.PNG";
		final String mockPath = "\\\\mortimer\\Workspaces\\cedric.maubach\\Allgemeines\\privates Projekt\\images\\ocrtest.jpeg";
//		final String mockPath = "\\\\mortimer\Workspaces\cedric.maubach\Allgemeines\privates Projekt\images\\ocrTextExample.PNG";
//		final String mockPath = "\\\\mortimer\Workspaces\cedric.maubach\Allgemeines\privates Projekt\images\\ocrnumberExample.PNG";

		String number = ocrHandler.readFromImage(mockPath);

		System.out.println(number);

	}
}
