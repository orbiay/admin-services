package io.mosip.preregistration.documents.errorcodes;

public enum ErrorMessages {
	
	DOCUMENT_FAILED_IN_QUALITY_CHECK,//PRG_PAM_DOC_001
	DOCUMENT_FAILED_IN_ENCRYPTION,//PRG_PAM_DOC_002
	DOCUMENT_FAILED_IN_DECRYPTION,//PRG_PAM_DOC_003
	DOCUMENT_INVALID_FORMAT,//PRG_PAM_DOC_004
	DOCUMENT_NOT_PRESENT,//PRG_PAM_DOC_005
	DOCUMENT_FAILED_TO_DELETE,//PRG_PAM_DOC_006
	DOCUMENT_EXCEEDING_PREMITTED_SIZE,//PRG_PAM_DOC_007
	DOCUMENT_TYPE_NOT_SUPPORTED,//PRG_PAM_DOC_008
	DOCUMENT_FAILED_TO_UPLOAD,//PRG_PAM_DOC_009
	DOCUMENT_FAILED_IN_VIRUS_SCAN,//PRG_PAM_DOC_010
	DOCUMENT_FAILED_TO_COPY,//PRG_PAM_DOC_011
	DOCUMENT_TABLE_NOTACCESSIBLE//PRG_PAM_DOC_012
	
}
