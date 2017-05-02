package egovframework.com.cmm.service.impl;

import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.com.cmm.ComDefaultCodeVO;
import egovframework.com.cmm.service.FileVO;
import egovframework.rte.psl.dataaccess.mapper.Mapper;


@Repository("fileManageMapper")
public interface FileManageMapper {	
	
	/**
	 * 여러 개의 파일에 대한 정보(속성 및 상세)를 등록한다.
	 *
	 * @param fileList
	 * @return
	 * @throws Exception
	 */
	String insertFileInfs(List<?> fileList) throws Exception;

	/**
	 * 하나의 파일에 대한 정보(속성 및 상세)를 등록한다.
	 *
	 * @param vo
	 * @throws Exception
	 */
	 void insertFileInf(FileVO vo) throws Exception;

	/**
	 * 여러 개의 파일에 대한 정보(속성 및 상세)를 수정한다.
	 *
	 * @param fileList
	 * @throws Exception
	 */
	void updateFileInfs(List<?> fileList) throws Exception;
	
	/**
	 * 여러 개의 파일을 삭제한다.
	 *
	 * @param fileList
	 * @throws Exception
	 */
	void deleteFileInfs(List<?> fileList) throws Exception;

	/**
	 * 하나의 파일을 삭제한다.
	 *
	 * @param fvo
	 * @throws Exception
	 */
	void deleteFileInf(FileVO fvo) throws Exception;
	
    /**
	 * 파일에 대한 목록을 조회한다.
	 *
	 * @param vo
	 * @return
	 * @throws Exception
	 */
    List<FileVO> selectFileInfs(FileVO vo) throws Exception ;

	/**
	 * 파일 구분자에 대한 최대값을 구한다.
	 *
	 * @param fvo
	 * @return
	 * @throws Exception
	 */
	int getMaxFileSN(FileVO fvo) throws Exception;
	

	/**
	 * 파일에 대한 상세정보를 조회한다.
	 *
	 * @param fvo
	 * @return
	 * @throws Exception
	 */
	FileVO selectFileInf(FileVO fvo) throws Exception;
	
	/**
	 * 전체 파일을 삭제한다.
	 *
	 * @param fvo
	 * @throws Exception
	 */
	void deleteAllFileInf(FileVO fvo) throws Exception;
	

	/**
	 * 파일명 검색에 대한 목록을 조회한다.
	 *
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	List<FileVO> selectFileListByFileNm(FileVO fvo) throws Exception;

	/**
	 * 파일명 검색에 대한 목록 전체 건수를 조회한다.
	 *
	 * @param fvo
	 * @return
	 * @throws Exception
	 */
	int selectFileListCntByFileNm(FileVO fvo) throws Exception ;

	/**
	 * 이미지 파일에 대한 목록을 조회한다.
	 *
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	List<FileVO> selectImageFileList(FileVO vo) throws Exception;

}


