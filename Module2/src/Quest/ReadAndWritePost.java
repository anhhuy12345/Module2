package Quest;



import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWritePost {
    final String COMMA = ",";

    public void writeToFile(String path, List<Post> list) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {

            writer.write("ID" + COMMA + "TITTLE" + COMMA + "SUBTILE" + COMMA + "CONTENT" + COMMA + "VIEW");
            for (Post post : list) {
                writer.newLine();
                writer.write(post.getId() + COMMA + post.getTitle() + COMMA + post.getSubTitle() +COMMA+ post.getContent()+COMMA + post.getViews());
//
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readToFile(String path) {
        List<Post> postList = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            File file = new File(path);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            String line;
            while ((line = reader.readLine()) != null) {
                //tạo chuỗi String chứa các thuộc tính của đối tượng ngăn cách bởi dấu ","
                String[] propertyPost = line.split(",");
                String id = propertyPost[0];
                String tittle = propertyPost[1];
                String subtitle = propertyPost[2];
                String content = propertyPost[3];
                String view = propertyPost[4];
                postList.add(new Post(id, tittle, subtitle, content, view));
            }
            postList.forEach(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
