package android.terminology.model;
public class InputModel {
    public static final String TABLE_NAME="input";
    public static final String COL_ID="ID";
    public static final String COL_TITLE="TITLE";
    public static final String COL_DES="DESCRIPTION";
    private String title;
    private String description;
    private int id;
    public static final String CREATE_TABLE=
            "CREATE TABLE "+TABLE_NAME+"("
                    +COL_ID+" INTEGER PRIMARY KEY AUTOINCREMENT,"
                    +COL_TITLE+" TEXT,"
                    +COL_DES+" TEXT"
                    +")";
    public InputModel(String title, String description, int id) {
        this.title = title;
        this.description = description;
        this.id = id;
    }

    public InputModel(){

    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}