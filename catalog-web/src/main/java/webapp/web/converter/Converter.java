package webapp.web.converter;

import webapp.core.model.BaseEntity;
import webapp.web.dto.BaseDto;



public interface Converter<Model extends BaseEntity<Long>, Dto extends BaseDto> {

    Model convertDtoToModel(Dto dto);

    Dto convertModelToDto(Model model);

}

