package info.futureme.abs.example.entity.g;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table "synccode".
 */
public class SyncCode {

    private Long id;
    private Long code;
    private String type;

    public SyncCode() {
    }

    public SyncCode(Long id) {
        this.id = id;
    }

    public SyncCode(Long id, Long code, String type) {
        this.id = id;
        this.code = code;
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
