package day170511.term_Inter;

import java.util.List;


import day170511.term.TermTaxonomy;
import day170511.term.TermTaxonomyExample;
import org.apache.ibatis.annotations.Param;


public interface TermTaxonomyMapper {
    long countByExample(TermTaxonomyExample example);

    int deleteByExample(TermTaxonomyExample example);

    int deleteByPrimaryKey(Long termTaxonomyId);

    int insert(TermTaxonomy record);

    int insertSelective(TermTaxonomy record);

    List<TermTaxonomy> selectByExampleWithBLOBs(TermTaxonomyExample example);

    List<TermTaxonomy> selectByExample(TermTaxonomyExample example);

    TermTaxonomy selectByPrimaryKey(Long termTaxonomyId);

    int updateByExampleSelective(@Param("record") TermTaxonomy record, @Param("example") TermTaxonomyExample example);

    int updateByExampleWithBLOBs(@Param("record") TermTaxonomy record, @Param("example") TermTaxonomyExample example);

    int updateByExample(@Param("record") TermTaxonomy record, @Param("example") TermTaxonomyExample example);

    int updateByPrimaryKeySelective(TermTaxonomy record);

    int updateByPrimaryKeyWithBLOBs(TermTaxonomy record);

    int updateByPrimaryKey(TermTaxonomy record);
}