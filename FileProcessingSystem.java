class FileProcessingSystem {
    public static void main(String[] args) {
        try {
            String data = null;
            System.out.println(data.length());
        } catch (Exception e) {
            System.out.println("Error while processing file");
        } finally {
            System.out.println("Cleanup done");
        }
    }
}