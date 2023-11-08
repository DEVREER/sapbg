 import java.io.FileNotFoundException;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.borders.Border;
import com.itextpdf.layout.borders.SolidBorder;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.element.Text;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.colors.Color;
import com.itextpdf.kernel.colors.DeviceGray;
import com.itextpdf.layout.properties.TextAlignment;
import com.itextpdf.layout.properties.UnitValue;

public class GeneratePDF {
    public static void main(String[] args) throws FileNotFoundException {
        String path = "invoice.pdf";
        PdfWriter pdfWriter = new PdfWriter(path);
        PdfDocument pdfDocument = new PdfDocument(pdfWriter);
        pdfDocument.setDefaultPageSize(PageSize.A4);
        Document document = new Document(pdfDocument);
        float threecol = 190f;
        float twocol = 285f;
        float twocol150 = twocol + 150f;
        float twocolumnWidth[] = {twocol150, twocol};
        float fullwidth[] = {threecol * 3};
        Paragraph onesp = new Paragraph("\n");

        Table table = new Table(twocolumnWidth);
        table.addCell(new Cell()
                .add(new Paragraph("FAKTURA")
                        .setFontSize(20f)
                        .setBold())
                .setBorder(new SolidBorder(DeviceGray.WHITE, 2f)));

        Table nestedTable = new Table(new float[]{twocol / 2, twocol / 2});
        nestedTable.addCell(getHeaderTextCell("Faktura No:"));
        nestedTable.addCell(getHeaderTextCellValue("No-123456"));
        nestedTable.addCell(getHeaderTextCell("Data na Faktura:"));
        nestedTable.addCell(getHeaderTextCellValue("31/12/1999"));
        nestedTable.addCell(getHeaderTextCell("Data na dostavka:"));
        nestedTable.addCell(getHeaderTextCellValue("13/09/1999"));

        table.addCell(new Cell()
                .add(nestedTable)
                .setBorder(null));

        Table divider = new Table(fullwidth);
        divider.setBorder(new SolidBorder(DeviceGray.GRAY, 2f));
        document.add(table);
        document.add(onesp);
        document.add(divider);
        document.add(onesp);

        float[] columnWidths = {1f, 1f}; // Two columns with equal width
        Table twoColTable = new Table(columnWidths);
        twoColTable.setWidth(UnitValue.createPercentValue(100)); // Set the table width to 100% of the page
        twoColTable.addCell(getBillingAndShippingCell("Poluchatel"));
        twoColTable.addCell(getBillingAndShippingCell("Dostavchik"));

        Table singleColTable1 = new Table(1);
        singleColTable1.addCell(getCell10fLeft("Ime na firma:", true));
        singleColTable1.addCell(getCell10fLeft("EIK:", false));
        singleColTable1.addCell(getCell10fLeft("DDS No:", false));
        singleColTable1.addCell(getCell10fLeft("Grad, Durjava:", false));
        singleColTable1.addCell(getCell10fLeft("Adres:", false));
        singleColTable1.addCell(getCell10fLeft("MOL:", false));

        Table singleColTable2 = new Table(1);
        singleColTable2.addCell(getCell10fRight("Ime na firma:", true));
        singleColTable2.addCell(getCell10fRight("EIK:", false));
        singleColTable2.addCell(getCell10fRight("DDS No:", false));
        singleColTable2.addCell(getCell10fRight("Grad, Durjava:", false));
        singleColTable2.addCell(getCell10fRight("Adres:", false));
        singleColTable2.addCell(getCell10fRight("MOL:", false));

// Add singleColTable1 and singleColTable2 as cells to the twoColTable
        twoColTable.addCell(singleColTable1);
        twoColTable.addCell(singleColTable2);

        document.add(twoColTable.setMarginBottom(12f));


        document.close();
    }

    static Cell getHeaderTextCell(String textValue) {
        return new Cell().add(new Paragraph(new Text(textValue).setBold()))
                .setBorder(null)
                .setTextAlignment(TextAlignment.LEFT);
    }

    static Cell getHeaderTextCellValue(String textValue) {
        return new Cell().add(new Paragraph(new Text(textValue))).setBorder(null).setTextAlignment(TextAlignment.LEFT);
    }

    static Cell getBillingAndShippingCell(String textValue) {
        return new Cell()
                .add(new Paragraph(textValue)
                        .setFontSize(12f)
                        .setBold()
                        .setBorder(null)
                        .setTextAlignment(TextAlignment.LEFT));
    }


    static Cell getCell10fLeft(String textValue, Boolean isBold){
        Cell myCell=new Cell().add(new Paragraph(textValue)).setFontSize(10f).setBorder(null).setTextAlignment(TextAlignment.LEFT);
                return isBold ?myCell.setBold():myCell;
    }

    static Cell getCell10fRight(String textValue, Boolean isBold){
        Cell myCell=new Cell().add(new Paragraph(textValue)).setFontSize(10f).setBorder(null).setTextAlignment(TextAlignment.LEFT);
        return isBold ?myCell.setBold():myCell;
    }



}