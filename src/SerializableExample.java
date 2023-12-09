import java.io.Serial;
import java.io.Serializable;

public class SerializableExample implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private final String data;

    public SerializableExample(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }
}