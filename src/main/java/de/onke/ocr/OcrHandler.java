package de.onke.ocr;

import java.io.File;

import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class OcrHandler {

	String readFromImage (final String inputPath) throws TesseractException {
		final Tesseract tesseract = new Tesseract();

		tesseract.setTessVariable("tessedit_char_whitelist", "0123456789/");

		tesseract.setDatapath("\\\\mortimer\\Workspaces\\cedric.maubach\\Allgemeines\\privates Projekt\\tessdata");

		return tesseract.doOCR(new File(inputPath));

	}

}
