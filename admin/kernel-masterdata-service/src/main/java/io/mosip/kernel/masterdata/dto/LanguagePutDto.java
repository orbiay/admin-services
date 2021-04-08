package io.mosip.kernel.masterdata.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import io.mosip.kernel.masterdata.validator.StringFormatter;
import io.mosip.kernel.masterdata.validator.ValidLangCode;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class LanguagePutDto {

	/**
	 * Field for language code
	 */

	@ValidLangCode(message = "Language Code is Invalid")
	@ApiModelProperty(value = "Language Code", required = true, dataType = "java.lang.String")
	private String code;

	/**
	 * Field for language name
	 */
	@NotNull
	@StringFormatter(min = 1, max = 64)
	@ApiModelProperty(value = "Language Name", required = true, dataType = "java.lang.String")
	private String name;

	/**
	 * Field for language family
	 */
	@Size(min = 0, max = 64)
	@ApiModelProperty(value = "Language Family", dataType = "java.lang.String")
	private String family;

	/**
	 * Field for language native name
	 */
	@Size(min = 0, max = 64)
	@ApiModelProperty(value = "Language Native Name", dataType = "java.lang.String")
	private String nativeName;

}
