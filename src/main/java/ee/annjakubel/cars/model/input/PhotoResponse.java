package ee.annjakubel.cars.model.input;

import lombok.Data;

@Data
public class PhotoResponse {
    private int albumId;
    private int id;
    private String title;
    private String url;
    private String thumbnailUrl;
}
