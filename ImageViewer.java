class ImageViewer{
    private static final int MAX_PLUGINS = 5;
    private int count = 0;
    ImageViewerInterface[] inters;
    ImageViewer(){
        inters = new ImageViewerInterface[MAX_PLUGINS];
    }
    
    void addPlugIn(ImageViewerInterface ivi){
        inters[count] = ivi;
        count++;
    }

    void show(String fileName, String ext) {
        String extArr = "";
        for (int count2 = 0; count2 < count; count2++) {
            extArr += inters[count2].getExtension();

            if (inters[count2].getExtension() == ext) {
                System.out.printf("Using %s \n", inters[count2].getName());
                inters[count2].show(fileName);
            }
        }
        if (extArr.indexOf(ext) == -1) {
            System.out.printf("Image viewer plugin for the extension, %s, is not registered \n", ext);
        }
    }
}


