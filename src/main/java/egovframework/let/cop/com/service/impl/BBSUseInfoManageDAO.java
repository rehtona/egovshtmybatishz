package egovframework.let.cop.com.service.impl;

import java.util.List;

import egovframework.let.cop.com.service.BoardUseInf;
import egovframework.let.cop.com.service.BoardUseInfVO;
import egovframework.rte.psl.dataaccess.EgovAbstractMapper;

import org.springframework.stereotype.Repository;

/**
 * 게시판 이용정보를 관리하기 위한 데이터 접근 클래스
 * @author 공통서비스개발팀 이삼섭
 * @since 2009.04.02
 * @version 1.0
 * @see
 *
 * <pre>
 * << 개정이력(Modification Information) >>
 *
 *   수정일       수정자           수정내용
 *  -------     --------    ---------------------------
 *   2009.04.02  이삼섭          최초 생성
 *   2011.05.31  JJY           경량환경 커스터마이징버전 생성
 *
 * </pre>
 */
@Repository("BBSUseInfoManageDAO")
public class BBSUseInfoManageDAO extends EgovAbstractMapper {

    /**
     * 게시판 사용 정보를 삭제한다.
     *
     * @param bdUseInf
     * @throws Exception
     */
    public void deleteBBSUseInf(BoardUseInf bdUseInf) throws Exception {
    	update("deleteBBSUseInf", bdUseInf);
    }

    /**
     * 커뮤니티에 사용되는 게시판 사용정보 목록을 조회한다.
     *
     * @param bdUseInf
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
    public List<BoardUseInf> selectBBSUseInfByCmmnty(BoardUseInfVO bdUseVO) throws Exception {
    	return (List<BoardUseInf>) list("selectBBSUseInfByCmmnty", bdUseVO);
    }

    /**
     * 동호회에 사용되는 게시판 사용정보 목록을 조회한다.
     *
     * @param bdUseInf
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
    public List<BoardUseInf> selectBBSUseInfByClub(BoardUseInfVO bdUseVO) throws Exception {
    	return (List<BoardUseInf>) list("selectBBSUseInfByClub", bdUseVO);
    }

    /**
     * 커뮤니티에 사용되는 모든 게시판 사용정보를 삭제한다.
     *
     * @param bdUseInf
     * @throws Exception
     */
    public void deleteAllBBSUseInfByCmmnty(BoardUseInfVO bdUseVO) throws Exception {
    	update("deleteAllBBSUseInfByCmmnty", bdUseVO);
    }

    /**
     * 동호회에 사용되는 모든 게시판 사용정보를 삭제한다.
     *
     * @param bdUseInf
     * @throws Exception
     */
    public void deleteAllBBSUseInfByClub(BoardUseInfVO bdUseVO) throws Exception {
    	update("BBSUseInfoManageDAO.deleteAllBBSUseInfByClub", bdUseVO);
    }

    /**
     * 게시판 사용정보를 등록한다.
     *
     * @param bdUseInf
     * @throws Exception
     */
    public void insertBBSUseInf(BoardUseInf bdUseInf) throws Exception {
    	insert("insertBBSUseInf", bdUseInf);
    }

    /**
     * 게시판 사용정보 목록을 조회한다.
     *
     * @param bdUseVO
     * @return
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
    public List<BoardUseInfVO> selectBBSUseInfs(BoardUseInfVO bdUseVO) throws Exception {
    	return (List<BoardUseInfVO>) list("selectBBSUseInfs", bdUseVO);
    }

    /**
     *
     * @param bdUseVO
     * @return
     * @throws Exception
     */
    public int selectBBSUseInfsCnt(BoardUseInfVO bdUseVO) throws Exception {
    	return (Integer)selectByPk("selectBBSUseInfsCnt", bdUseVO);
    }

    /**
     * 게시판 사용정보에 대한 상세정보를 조회한다.
     *
     * @param bdUseVO
     * @return
     * @throws Exception
     */
    public BoardUseInfVO selectBBSUseInf(BoardUseInfVO bdUseVO) throws Exception {
    	return (BoardUseInfVO)selectByPk("selectBBSUseInf", bdUseVO);
    }

    /**
     * 게시판 사용정보를 수정한다.
     *
     * @param bdUseInf
     * @throws Exception
     */
    public void updateBBSUseInf(BoardUseInf bdUseInf) throws Exception {
    	update("updateBBSUseInf", bdUseInf);
    }

    /**
     * 게시판에 대한 사용정보를 삭제한다.
     *
     * @param bdUseInf
     * @throws Exception
     */
    public void deleteBBSUseInfByBoardId(BoardUseInf bdUseInf) throws Exception {
	update("deleteBBSUseInfByBoardId", bdUseInf);
    }

    /**
     * 커뮤니티, 동호회에 사용되는 게시판 사용정보에 대한 목록을 조회한다.
     *
     * @param bdUseVO
     * @return
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
    public List<BoardUseInfVO> selectBBSUseInfsByTrget(BoardUseInfVO bdUseVO) throws Exception {
    	return (List<BoardUseInfVO>) list("selectBBSUseInfsByTrget", bdUseVO);
    }

    /**
     * 커뮤니티, 동호회에 사용되는 게시판 사용정보에 대한 전체 건수를 조회한다.
     *
     * @param bdUseVO
     * @return
     * @throws Exception
     */
    public int selectBBSUseInfsCntByTrget(BoardUseInfVO bdUseVO) throws Exception {
    	return (Integer)selectByPk("selectBBSUseInfsCntByTrget", bdUseVO);
    }

    /**
     * 커뮤니티, 동호회에 사용되는 게시판 사용정보를 수정한다.
     *
     * @param bdUseInf
     * @throws Exception
     */
    public void updateBBSUseInfByTrget(BoardUseInf bdUseInf) throws Exception {
    	update("updateBBSUseInfByTrget", bdUseInf);
    }

}
