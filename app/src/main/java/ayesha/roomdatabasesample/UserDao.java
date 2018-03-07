package ayesha.roomdatabasesample;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

/**
 * Created by Aalishan on 07/03/18.
 */
@Dao
public interface UserDao {
    @Query("SELECT * FROM user")
    List<User> getAll();

    /*@Query("SELECT * FROM user WHERE uId IN (:uId)")
    List<User> loadAllByIds(int[] userIds);

    @Query("SELECT * FROM user WHERE firstName LIKE :firstName AND "
            + "last_name LIKE :last LIMIT 1")
    User findByName(String first, String last);*/

    @Insert
    void insertAll(User... users);

    @Delete
    void delete(User user);
}
