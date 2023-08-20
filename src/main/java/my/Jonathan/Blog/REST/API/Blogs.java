package my.Jonathan.Blog.REST.API;
import com.fasterxml.jackson.annotation.JsonProperty;
import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection="BlogPost")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Blogs {
    @Id
    @JsonProperty("_id")
    private String _id;
    @JsonProperty("title")
    private String title;
    @JsonProperty("date")
    private String date;
    @JsonProperty("description")
    private String description;

    public static class _id {
        @JsonProperty("$oid")
        private String $oid;

        public String get$oid(){return $oid;}

        public void set$oid(String $oid) {this.$oid = $oid;}
    }
}
