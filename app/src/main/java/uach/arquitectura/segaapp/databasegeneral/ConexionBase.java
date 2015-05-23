package uach.arquitectura.segaapp.databasegeneral;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Clase que conectara a la base de datos para su uso a lo largo de la aplicacion.
 * @author  Erik David Zubia Hernandez
 * @since 23/05/2015.
 * @version 1.0
 */
public class ConexionBase extends SQLiteOpenHelper{

    Context context;

    public ConexionBase(Context context) {
        super(context, "segaApp", null, 1);
        this.context = context;
    }

    public ConexionBase(Context context, String name, SQLiteDatabase.CursorFactory factory, int version, DatabaseErrorHandler errorHandler) {
        super(context, name, factory, version, errorHandler);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("create table alumnos(matricula INTEGER PRIMARY AUTOINCREMENT, nombre_alumno TEXT NOT NULL, contrasena TEXT NOT NULL, apellido_paterno TEXT NOT NULL, apellido_materno TEXT NOT NULL, carrera TEXT NOT NULL)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        
    }
}
