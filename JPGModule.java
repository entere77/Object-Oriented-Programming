class JPGModule implements ImageViewerInterface{
    @Override
    public String getName() {
        return "JPG Module";
    }

    @Override
    public void show(String fileName) {
        System.out.println("JPG image Loading: " + fileName);
    }

    @Override
    public String getExtension() {
        return "JPG";
    }
}
