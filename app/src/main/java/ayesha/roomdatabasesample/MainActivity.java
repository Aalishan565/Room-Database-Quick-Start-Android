package ayesha.roomdatabasesample;

import android.arch.persistence.room.Room;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.io.Serializable;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AppDatabase db = Room.databaseBuilder(getApplicationContext(),
                AppDatabase.class, "database-name").allowMainThreadQueries().build();
        UserDao mUserDao = db.userDao();
        User user1 = new User();
        user1.setFirstName("george");
        user1.setLastName("ama");
        User user2 = new User();
        user2.setFirstName("george");
        user2.setLastName("ama");
        User user3 = new User();
        user3.setFirstName("george");
        user3.setLastName("ama");
        mUserDao.insertAll(user1);
        mUserDao.insertAll(user2);
        mUserDao.insertAll(user3);
        Log.d("data",""+mUserDao.getAll().get(0).getFirstName());
    }
}
