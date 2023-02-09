package shop.mtcoding.blog2.model;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BoardRepository {
    public int insert();

    public int updateById(int id);

    public int deleteById(int id);

    public List<Board> findAll();

    public Board findById(int id);
}
