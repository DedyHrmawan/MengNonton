/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mengnonton;

/**
 *
 * @author meded
 */
import java.io.FileOutputStream;
import java.util.Date;

import com.itextpdf.text.Anchor;
import com.itextpdf.text.BadElementException;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chapter;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.List;
import com.itextpdf.text.ListItem;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.Section;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JTable;

public class PdfGenerator {
    private static String FILE = "e:/Downloads/FirstPdf.pdf";
    private static Font catFont = new Font(Font.FontFamily.TIMES_ROMAN, 18,
            Font.BOLD);
    private static Font redFont = new Font(Font.FontFamily.TIMES_ROMAN, 12,
            Font.NORMAL, BaseColor.RED);
    private static Font subFont = new Font(Font.FontFamily.TIMES_ROMAN, 16,
            Font.BOLD);
    private static Font smallBold = new Font(Font.FontFamily.TIMES_ROMAN, 12,
            Font.BOLD);

    public static void main(String[] args) {
        try {
            Document document = new Document();
            PdfWriter.getInstance(document, new FileOutputStream(FILE));
            document.open();
            addMetaData(document);
            addTitlePage(document);
            addContent(document);
            document.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void printLaporan(JTable table, String title, String subTitle, String total){
        Date dicetak = new Date();
        DateFormat dateFormat = new SimpleDateFormat("d MMMM yyyy k:mm"); 
        DateFormat dateFormat2 = new SimpleDateFormat("YYYYMMdkmm");      
        try {
            Document document = new Document();
            PdfWriter.getInstance(document, new FileOutputStream("C://Users/meded/Downloads/"+title+"_"+dateFormat2.format(dicetak)+".pdf"));
            document.open();
            
            PdfPTable pdfTable = new PdfPTable(table.getColumnCount());
            Paragraph preface = new Paragraph();
            Paragraph postface = new Paragraph();
            PdfPCell cell;
            
            preface.add(new Paragraph(title, catFont));
            preface.add(new Paragraph(subTitle, smallBold));
            addEmptyLine(preface, 1);
            
            addEmptyLine(postface, 1);
            postface.add(new Paragraph("Dicetak pada: "+dateFormat.format(dicetak), smallBold));
            
            for (int i = 0; i < table.getColumnCount(); i++) {
                pdfTable.addCell(table.getColumnName(i));
            }
            
            for (int rows = 0; rows < table.getRowCount(); rows++) {
                for (int cols = 0; cols < table.getColumnCount(); cols++) {
                    System.out.println(table.getModel().getValueAt(rows, cols).toString());
                    pdfTable.addCell(table.getModel().getValueAt(rows, cols).toString());
                }
            }
            
            cell = new PdfPCell(new Paragraph(total, smallBold));
            cell.setColspan(table.getColumnCount());
            pdfTable.addCell(cell);
            
            document.add(preface);
            document.add(pdfTable);
            document.add(postface);
            document.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void printStruk(String title, String total){
        ResultSet RsProduk=null;
        Date dicetak = new Date();
        DateFormat dateFormat = new SimpleDateFormat("d MMMM yyyy k:mm"); 
        DateFormat dateFormat2 = new SimpleDateFormat("YYYYMMdkmm");      
        try {
            Document document = new Document();
            PdfWriter.getInstance(document, new FileOutputStream("C://Users/meded/Downloads/"+title+"_"+dateFormat2.format(dicetak)+".pdf"));
            document.open();
            
            PdfPTable pdfTable = new PdfPTable(3);
            Paragraph preface = new Paragraph();
            Paragraph postface = new Paragraph();
            PdfPCell cell = new PdfPCell();
            
            pdfTable.getDefaultCell().setBorder(0);            
            pdfTable.setHorizontalAlignment(Element.ALIGN_LEFT);
            
            preface.add(new Paragraph("PEMBAYARAN MENGNONTON CINEMA", smallBold));
            preface.add(new Paragraph("Indonesia, Malang 65125", smallBold));
            preface.add(new Paragraph("(415) 861-321", smallBold));
            addEmptyLine(preface, 1);            
            preface.add(new Paragraph(""+dateFormat.format(dicetak), smallBold));
            preface.add(new Paragraph("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -", smallBold));
            addEmptyLine(preface, 1);  
            
            Connection conn=(Connection)koneksi.koneksiDB();
            Statement stt=conn.createStatement();
            RsProduk=stt.executeQuery("SELECT p.*, m.NAMA_MAKANAN from pemesanan p, "
                    + "makanan m WHERE STATUS = 0 AND p.ID_BARANG = m.ID_MAKANAN");
            
            while(RsProduk.next()){
                pdfTable.addCell(RsProduk.getString("NAMA_MAKANAN"));
                pdfTable.addCell(RsProduk.getString("JUMLAH_PEMESANAN"));
                pdfTable.addCell(RsProduk.getString("TOTAL_TAGIHAN"));
            } 
            
            while(RsProduk.next()){
                pdfTable.addCell(RsProduk.getString("NAMA_MAKANAN"));
                pdfTable.addCell(RsProduk.getString("JUMLAH_PEMESANAN"));
                pdfTable.addCell(RsProduk.getString("TOTAL_TAGIHAN"));
            } 
            
            RsProduk=stt.executeQuery("SELECT p.*, m.NAMA_MINUMAN from pemesanan p, "
                    + "minuman m WHERE STATUS = 0 AND p.ID_BARANG = m.ID_MINUMAN");
            
            while(RsProduk.next()){
                pdfTable.addCell(RsProduk.getString("NAMA_MINUMAN"));
                pdfTable.addCell(RsProduk.getString("JUMLAH_PEMESANAN"));
                pdfTable.addCell(RsProduk.getString("TOTAL_TAGIHAN"));
            } 
            
            RsProduk=stt.executeQuery("SELECT * from pemesanan WHERE STATUS = 0 AND TIPE_PEMESANAN = 3");
                    
            
            while(RsProduk.next()){
                pdfTable.addCell(RsProduk.getString("ID_BARANG"));
                pdfTable.addCell(RsProduk.getString("JUMLAH_PEMESANAN"));
                pdfTable.addCell(RsProduk.getString("TOTAL_TAGIHAN"));
            }  
            
            cell = new PdfPCell(new Paragraph(total, smallBold));
            cell.setColspan(3); 
            cell.setBorder(0);
            pdfTable.addCell(cell);  
            
            postface.add(new Paragraph("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -", smallBold));
            postface.add(new Paragraph("                           It's been pleasure serving you!", smallBold));
            postface.add(new Paragraph("                                 Have a wonderful day.", smallBold));
            postface.add(new Paragraph("                                      * Thank You *", smallBold));
            
            document.add(preface);
            document.add(pdfTable);
            document.add(postface);
            document.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // iText allows to add metadata to the PDF which can be viewed in your Adobe
    // Reader
    // under File -> Properties
    private static void addMetaData(Document document) {
        document.addTitle("My first PDF");
        document.addSubject("Using iText");
        document.addKeywords("Java, PDF, iText");
        document.addAuthor("Lars Vogel");
        document.addCreator("Lars Vogel");
    }

    private static void addTitlePage(Document document)
            throws DocumentException {
        Paragraph preface = new Paragraph();
        // We add one empty line
        addEmptyLine(preface, 1);
        // Lets write a big header
        preface.add(new Paragraph("Title of the document", catFont));

        addEmptyLine(preface, 1);
        // Will create: Report generated by: _name, _date
        preface.add(new Paragraph(
                "Report generated by: " + System.getProperty("user.name") + ", " + new Date(), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
                smallBold));
        addEmptyLine(preface, 3);
        preface.add(new Paragraph(
                "This document describes something which is very important ",
                smallBold));

        addEmptyLine(preface, 8);

        preface.add(new Paragraph(
                "This document is a preliminary version and not subject to your license agreement or any other agreement with vogella.com ;-).",
                redFont));

        document.add(preface);
        // Start a new page
        document.newPage();
    }

    private static void addContent(Document document) throws DocumentException {
        Anchor anchor = new Anchor("First Chapter", catFont);
        anchor.setName("First Chapter");

        // Second parameter is the number of the chapter
        Chapter catPart = new Chapter(new Paragraph(anchor), 1);

        Paragraph subPara = new Paragraph("Subcategory 1", subFont);
        Section subCatPart = catPart.addSection(subPara);
        subCatPart.add(new Paragraph("Hello"));

        subPara = new Paragraph("Subcategory 2", subFont);
        subCatPart = catPart.addSection(subPara);
        subCatPart.add(new Paragraph("Paragraph 1"));
        subCatPart.add(new Paragraph("Paragraph 2"));
        subCatPart.add(new Paragraph("Paragraph 3"));

        // add a list
        createList(subCatPart);
        Paragraph paragraph = new Paragraph();
        addEmptyLine(paragraph, 5);
        subCatPart.add(paragraph);

        // add a table
        createTable(subCatPart);

        // now add all this to the document
        document.add(catPart);

        // Next section
        anchor = new Anchor("Second Chapter", catFont);
        anchor.setName("Second Chapter");

        // Second parameter is the number of the chapter
        catPart = new Chapter(new Paragraph(anchor), 1);

        subPara = new Paragraph("Subcategory", subFont);
        subCatPart = catPart.addSection(subPara);
        subCatPart.add(new Paragraph("This is a very important message"));

        // now add all this to the document
        document.add(catPart);

    }

    private static void createTable(Section subCatPart)
            throws BadElementException {
        PdfPTable table = new PdfPTable(3);

        // t.setBorderColor(BaseColor.GRAY);
        // t.setPadding(4);
        // t.setSpacing(4);
        // t.setBorderWidth(1);

        PdfPCell c1 = new PdfPCell(new Phrase("Table Header 1"));
        c1.setHorizontalAlignment(Element.ALIGN_CENTER);
        table.addCell(c1);

        c1 = new PdfPCell(new Phrase("Table Header 2"));
        c1.setHorizontalAlignment(Element.ALIGN_CENTER);
        table.addCell(c1);

        c1 = new PdfPCell(new Phrase("Table Header 3"));
        c1.setHorizontalAlignment(Element.ALIGN_CENTER);
        table.addCell(c1);
        table.setHeaderRows(1);

        table.addCell("1.0");
        table.addCell("1.1");
        table.addCell("1.2");
        table.addCell("2.1");
        table.addCell("2.2");
        table.addCell("2.3");

        subCatPart.add(table);

    }

    private static void createList(Section subCatPart) {
        List list = new List(true, false, 10);
        list.add(new ListItem("First point"));
        list.add(new ListItem("Second point"));
        list.add(new ListItem("Third point"));
        subCatPart.add(list);
    }

    private static void addEmptyLine(Paragraph paragraph, int number) {
        for (int i = 0; i < number; i++) {
            paragraph.add(new Paragraph(" "));
        }
    }
}
