package regis.model.dao;



import java.util.List;

import regis.model.Votesystem;

public interface VotesystemDAO {
	// 新增一筆記錄
	int save(Votesystem vs);

	// 依鍵值查詢一筆記錄
	Votesystem findByPrimaryKey(long key);

	// 依鍵值修改一筆紀錄
	int update(Votesystem member);
	
	List<Votesystem> findPlan(Long word);
	
	List<Votesystem> getAll();
	
	List<Votesystem> getClass(String word);

	}

