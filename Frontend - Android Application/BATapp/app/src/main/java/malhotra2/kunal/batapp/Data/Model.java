package malhotra2.kunal.batapp.Data;

public class Model {

    String names, industry;
    int images;

    public Model(String names, String industry, int images) {
        this.names = names;
        this.industry = industry;
        this.images = images;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public int getImages() {
        return images;
    }

    public void setImages(int images) {
        this.images = images;
    }
}
