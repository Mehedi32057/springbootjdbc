package com.Mehedi.springbootjdbc.dao;

import com.Mehedi.springbootjdbc.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class Dao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public boolean insertUser(User user)

    {
        boolean statues=false;
       try {
           String Insert_Sql_Query="INSERT INTO user(name,email,gender,city) VAlUES(?,?,?,?)";
         int count=  jdbcTemplate.update(Insert_Sql_Query,user.getName(),user.getEmail(),user.getGender(),user.getCity());
   if (count>0){
       statues=true;
   }

   else {
       statues=false;
   }

       } catch (Exception e) {
           statues= false;
           e.printStackTrace();


       }
        return statues;
    }

    public boolean updateUser( User user){
        boolean status=false;

        try {
            String Update_SqL_Query= "UPDATE user SET name=?, gender=?, city=? WHERE email=?";

            int count = jdbcTemplate.update(Update_SqL_Query, user.getName(), user.getGender(), user.getCity(), user.getEmail());


            if (count>0){
                status=true;

            }
            else {
                status=false;
            }



        }

        catch (Exception e){

            e.printStackTrace();
        }


        return status;
    }

    public boolean deleteUserByEmail(String email){
        boolean status=false;


        try {
            String Delete_Sql_query="DELETE FROM user WHERE email=?";
            int count= jdbcTemplate.update(Delete_Sql_query,email);

            if (count>0){
                status=true;
            }
            else {

                status=false;}




        }

        catch (Exception e){
            e.printStackTrace();
        }

        return status;





    }
}
