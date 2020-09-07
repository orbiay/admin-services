package io.mosip.admin.bulkdataupload.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import io.mosip.admin.bulkdataupload.entity.BulkUploadTranscation;
import io.mosip.kernel.core.dataaccess.spi.repository.BaseRepository;
/**
 * this classs BulkUploadTranscationRepository
 * 
 * @author dhanendra
 *
 */
@Repository
public interface BulkUploadTranscationRepository extends BaseRepository<BulkUploadTranscation, UUID> {

	@Query("FROM BulkUploadTranscation WHERE id =?1 AND (isDeleted is null OR isDeleted = false) AND isActive = true")
	BulkUploadTranscation findTransactionById(UUID id);
}