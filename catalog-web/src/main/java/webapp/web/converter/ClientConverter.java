package webapp.web.converter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import webapp.core.model.Client;
import webapp.web.dto.ClientDto;

@Component
public class ClientConverter extends BaseConverter<Client, ClientDto> {

    private static final Logger log = LoggerFactory.getLogger(
            ClientConverter.class);

    @Override
    public Client convertDtoToModel(ClientDto dto) {
        Client client = new Client(dto.getName());
        client.setId(dto.getId());
        return client;
    }

    @Override
    public ClientDto convertModelToDto(Client client) {
        ClientDto clientDto = new ClientDto(client.getName());
        clientDto.setId(client.getId());
        return clientDto;
    }
}
