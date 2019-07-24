package android.Guide.Database;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.Guide.model.InputModel;
import java.util.ArrayList;
import java.util.List;
public class InputDatabaseHelper extends SQLiteOpenHelper {
    private static final Integer DATABASE_VERSION=1;
    private static final String DATABASE_NAME="input_db";
    public InputDatabaseHelper(Context context){
        super(context,DATABASE_NAME,null,DATABASE_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
       db.execSQL(InputModel.CREATE_TABLE);
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
         db.execSQL("DROP TABLE IF EXISTS "+InputModel.TABLE_NAME);
         onCreate(db);
    }
    public long insertData(String title,String des){
        SQLiteDatabase database=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(InputModel.COL_TITLE,title);
        contentValues.put(InputModel.COL_DES,des);
        long id=database.insert(InputModel.TABLE_NAME,null,contentValues);
        database.close();
        return id;
    }
    public InputModel getParticularData(long id){
        SQLiteDatabase db=this.getReadableDatabase();
        Cursor cursor=db.query(InputModel.TABLE_NAME,
                new String[]{InputModel.COL_ID,InputModel.COL_TITLE,InputModel.COL_DES},
                InputModel.COL_ID+"=?",
                new String[]{String.valueOf(id)},
                null,null,null,null);
        if(cursor!=null)
            cursor.moveToFirst();
        InputModel inputType=new InputModel(
                cursor.getString(cursor.getColumnIndex(InputModel.COL_TITLE)),
                cursor.getString(cursor.getColumnIndex(InputModel.COL_DES)),
                cursor.getInt(cursor.getColumnIndex(InputModel.COL_ID))
        ) ;
        cursor.close();
        return inputType;
    }
    public List<InputModel> getAllData(){
        ArrayList<InputModel> modelArrayList=new ArrayList<>();
        String query="SELECT * FROM "+InputModel.TABLE_NAME;
        SQLiteDatabase database=this.getReadableDatabase();
        Cursor cursor=database.rawQuery(query,null);
        if(cursor.moveToFirst()){
            do{
                InputModel inputModel=new InputModel();
                inputModel.setId(cursor.getInt(cursor.getColumnIndex(InputModel.COL_ID)));
                inputModel.setTitle(cursor.getString(cursor.getColumnIndex(InputModel.COL_TITLE)));
                inputModel.setDescription(cursor.getString(cursor.getColumnIndex(InputModel.COL_DES)));
                modelArrayList.add(inputModel);
            }while (cursor.moveToNext());
        }
        database.close();
        return  modelArrayList;
    }
    public int updateTerm(InputModel model){
        SQLiteDatabase database=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(InputModel.COL_TITLE,model.getTitle());
        contentValues.put(InputModel.COL_DES,model.getDescription());
        int result=database.update(InputModel.TABLE_NAME,contentValues,InputModel.COL_ID+" = ? ",new String[]{String.valueOf(model.getId())});
        database.close();
        return  result;
    }
    public void deleteNode(InputModel model){
        SQLiteDatabase sqLiteDatabase=this.getWritableDatabase();
        sqLiteDatabase.delete(InputModel.TABLE_NAME,InputModel.COL_ID+" = ? ",new String[]{String.valueOf(model.getId())});
        sqLiteDatabase.close();
    }
}