package mvc.dao;
import mvc.vo.User; //引用mvc.vo包里面的User类
//主要定义操作的接口，定义一系列数据库的原子性操作，例如：增加、修改、删除、按ID查询等；
public interface IUserDAO { 
        /** 
         * 用户登录验证 
         *@param user 传入VO对象 
         *@param 验证的操作结果 
         *@throw Exception 
         */ 
    public boolean findLogin(User user)throws Exception; 
} 