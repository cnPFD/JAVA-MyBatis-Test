package day170511.term_Inter;

import java.util.List;

import day170511.term.Terms;
import day170511.term.TermsExample;
import org.apache.ibatis.annotations.Param;


public interface TermsMapper {
    long countByExample(TermsExample example);
    int deleteByExample(TermsExample example);
    int deleteByPrimaryKey(Long termId);
    int insert(Terms record);
    int insertSelective(Terms record);
    List<Terms> selectByExample(TermsExample example);
    Terms selectByPrimaryKey(Long termId);
    int updateByExampleSelective(@Param("record") Terms record, @Param("example") TermsExample example);
    int updateByExample(@Param("record") Terms record, @Param("example") TermsExample example);
    int updateByPrimaryKeySelective(Terms record);
    int updateByPrimaryKey(Terms record);


}