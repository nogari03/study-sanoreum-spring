package project.admin.e_p005.dao;

import java.util.List;
import java.util.Map;

public interface E_p005DAO {

	List searchPayList(Map<String, String> search_keyword)throws Exception;

	String sumPrice(Map<String, String> search_keyword)throws Exception;

	String avgPrice(Map<String, String> search_keyword)throws Exception;

	List selectSearch(Map<String, String> select_keyword)throws Exception;

	String toDaySales(Map map)throws Exception;

	List cancelhPayList(Map<String, String> search_keyword)throws Exception;

	String sumCancelPay(Map<String, String> search_keyword)throws Exception;
}