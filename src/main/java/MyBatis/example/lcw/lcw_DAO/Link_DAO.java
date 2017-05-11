package MyBatis.example.lcw.lcw_DAO;


import MyBatis.example.lcw.Domain.Link;

/**
 * Created by soft01 on 2017/5/9.
 */
public interface Link_DAO {
    public Link showusermsg(int id);
    public void insert(Link user);
    public void deleteuser(String idcardnum);
    public void updateuser(Link user);
    public int insertSelective(Link record);
}
