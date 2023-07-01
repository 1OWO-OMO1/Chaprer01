package cn.lzy.mybatiscatalog;

import org.apache.ibatis.annotations.*;

@Mapper
public interface CommentMapper {
    @Select("SELECT * FROM t_comment WHERE id =#{id}")
    public Comment findById(Integer id);

/*    @Insert("INSERT INTO t_comment(content,author,a_id) " +
            "values (#{content},#{author},#{aId})")
    public int insertComment(Comment comment);//插入*/

    @Update("UPDATE t_comment SET content=#{content} WHERE id=#{id}")
    public int updateComment(Comment comment);//更新

    @Delete("DELETE FROM t_comment WHERE id=#{id}")
    public int deleteComment(Integer id);//删除

    @Select("SELECT * FROM t_comment WHERE author =#{id}")
    public Comment czauther(String author);

    @Update("UPDATE t_comment SET content=#{content} WHERE author=#{author}")
    public int gxauthor(Comment comment);//更新
}


