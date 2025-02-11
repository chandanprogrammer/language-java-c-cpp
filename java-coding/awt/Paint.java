import java.awt.*;

public class Paint extends Frame {
    Paint() {

        setTitle("Paint");
        
        MenuBar menu = new MenuBar();

        // Menu
        Menu file = new Menu("File");
        Menu edit = new Menu("Edit");
        Menu view = new Menu("View");

        // File menu
        MenuItem new1 = new MenuItem("New");
        MenuItem open = new MenuItem("Open");
        Menu importToCanvas = new Menu("Import to canvas");
        MenuItem fromFile = new MenuItem("From a file");
        MenuItem fromScannerCamera = new MenuItem("From scanner or camera");
        Menu recent = new Menu("Recent");
        MenuItem save = new MenuItem("Save");
        Menu saveAs = new Menu("Save as");
        MenuItem png = new MenuItem("PNG picture");
        MenuItem jpeg = new MenuItem("JPEG picture");
        MenuItem bmp = new MenuItem("BMP picture");
        MenuItem gif = new MenuItem("GIF picture");
        MenuItem otherFormat = new MenuItem("Other format");
        Menu print = new Menu("Print");
        MenuItem print1 = new MenuItem("Print");
        MenuItem pageSetup = new MenuItem("Page setup");
        MenuItem printPreview = new MenuItem("Print preview");
        MenuItem share = new MenuItem("Share");
        MenuItem imgProp = new MenuItem("Image properties");
        MenuItem exit = new MenuItem("Exit");
        MenuItem cut = new MenuItem("Cut");
        MenuItem copy = new MenuItem("Copy");
        MenuItem paste = new MenuItem("Paste");
        Menu zoom = new Menu("Zoom");
        MenuItem zoomIn = new MenuItem("Zoom in");
        MenuItem zoomOut = new MenuItem("Zoom out");
        MenuItem fitToWindow = new MenuItem("Fit to window");
        MenuItem rulers = new MenuItem("Rulers");
        MenuItem gridLnes = new MenuItem("Gridlines");
        MenuItem statusBar = new MenuItem("Status bar");
        MenuItem fullScreen = new MenuItem("Full screen");
        MenuItem thumbnail = new MenuItem("Thumbnail");

        file.add(new1);
        file.add(open);
        file.add(importToCanvas);
        importToCanvas.add(fromFile);
        importToCanvas.add(fromScannerCamera);
        file.add(recent);
        file.add(save);
        file.add(saveAs);
        saveAs.add(png);
        saveAs.add(jpeg);
        saveAs.add(bmp);
        saveAs.add(gif);
        saveAs.add(otherFormat);
        file.add(print);
        print.add(print1);
        print.add(pageSetup);
        print.add(printPreview);
        file.add(share);
        file.add(imgProp);
        file.add(exit);

        edit.add(cut);
        edit.add(copy);
        edit.add(paste);

        view.add(zoom);
        zoom.add(zoomIn);
        zoom.add(zoomOut);
        zoom.add(fitToWindow);
        view.add(rulers);
        view.add(gridLnes);
        view.add(statusBar);
        view.add(fullScreen);
        view.add(thumbnail);

        menu.add(file);
        menu.add(edit);
        menu.add(view);

        setMenuBar(menu);

        setSize(600, 600);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        Paint ref = new Paint();
    }
}