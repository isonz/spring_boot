package cn.ptp;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface MessageRepository extends PagingAndSortingRepository<Message, Long>
{
	Optional<Message> findById(int id);
	
	//@Query("select c from message c where c.name = ?1")
	Optional<Message> findByName(String name);
}
