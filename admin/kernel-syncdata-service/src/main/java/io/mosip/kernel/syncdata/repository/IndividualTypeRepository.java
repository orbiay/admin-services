package io.mosip.kernel.syncdata.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import io.mosip.kernel.syncdata.entity.IndividualType;
import io.mosip.kernel.syncdata.entity.id.CodeAndLanguageCodeID;

/**
 * Repository class to handle CRUD operations for
 * {@link IndividualTypeRepository}}
 * 
 * @author Srinivasan
 *
 */
@Repository
public interface IndividualTypeRepository extends JpaRepository<IndividualType, CodeAndLanguageCodeID> {

	/**
	 * 
	 * @param lastUpdatedTime - last updated time stamp
	 * @param currentTime     - currentTimestamp
	 * @return list of {@link IndividualType} - list of individual types
	 */
	@Cacheable(cacheNames = "initial-sync", key = "'individual_type'", condition = "#a0.getYear() <= 1970")
	@Query("FROM IndividualType it WHERE (createdDateTime BETWEEN ?1 AND ?2) OR (updatedDateTime BETWEEN ?1 AND ?2)  OR (deletedDateTime BETWEEN ?1 AND ?2)")
	public List<IndividualType> findAllIndvidualTypeByTimeStamp(LocalDateTime lastUpdatedTime,
			LocalDateTime currentTime);

	@Cacheable(cacheNames = "delta-sync", key = "'individual_type'")
	@Query(value = "select max(aam.createdDateTime), max(aam.updatedDateTime) from IndividualType aam ")
	List<Object[]> getMaxCreatedDateTimeMaxUpdatedDateTime();
}
