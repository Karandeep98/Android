package codingblocks.com.room

import androidx.room.*

//Dao= Data access objects

@Dao
interface TodoDao {
    @Insert
    fun insert(todo: Todo)

    @Insert
    fun insertMultiple(todolist:ArrayList<Todo>)

    @Query("Select * from Todo")
    fun getalltask():List<Todo>


    @Query("Select * from Todo  order by status desc")
    fun getalldonetask():List<Todo>



    @Query("Select * from Todo order by status=:todo")
    fun sort(todo: List<Boolean>):List<Todo>

    @Delete
    fun deletetask(todo: Todo)

    @Update
    fun updatecheck(todo: Todo)

    @Update
    fun updateTask(todo: Todo)
    @Delete
    fun deleteall(todo: Todo)
}