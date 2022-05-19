public class Ingredient {
    private String name;
    private String fileImage;

    public Ingredient(String name, String fileImage){
        this.name = name;
        this.fileImage = fileImage;
    }

    public String getName() {return name;}
    public String getFileImage() {return fileImage;}

    public void setName(String name) {this.name = name;}
    public void setFileImage(String fileImage) {this.fileImage = fileImage;}
}
