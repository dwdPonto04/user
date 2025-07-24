package com.david.santos.user.business.converter;

import com.david.santos.user.business.dto.AddressDTO;
import com.david.santos.user.business.dto.NumberPhoneDTO;
import com.david.santos.user.business.dto.UserDTO;
import com.david.santos.user.infrastructure.entity.Address;
import com.david.santos.user.infrastructure.entity.NumberPhone;
import com.david.santos.user.infrastructure.entity.User;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserConverter {

    public User forUser(UserDTO userDTO){
        return User.builder()
                .name(userDTO.getName())
                .email(userDTO.getEmail())
                .password(userDTO.getPassword())
                .numberPhones(this.forListNumberPhoneDTO(userDTO.getNumberPhones()))
                .addresses(forListAddressDTO(userDTO.getAddresses()))

                .build();
    }

    public List<NumberPhone> forListNumberPhoneDTO(List<NumberPhoneDTO> numberPhoneDTOS){
        return numberPhoneDTOS.stream().map(this::forNumberPhoneDTO).toList();
    }

    public NumberPhone forNumberPhoneDTO(NumberPhoneDTO numberPhoneDTO){
        return NumberPhone.builder()
                .ddd(numberPhoneDTO.getDdd())
                .number(numberPhoneDTO.getNumber())
                .build();
    }

    public List<Address> forListAddressDTO (List<AddressDTO> addressDTOS){
        return addressDTOS.stream().map(this::forAddressDTO).toList();
    }
    public  Address forAddressDTO(AddressDTO addressDTO ){
        return Address.builder()
                .street(addressDTO.getStreet())
                .city(addressDTO.getCity())
                .state(addressDTO.getState())
                .number(addressDTO.getNumber())
                .complement(addressDTO.getComplement())
                .cep(addressDTO.getCep())

                .build();
    }




    public UserDTO forUserDTO(User user){
        return UserDTO.builder()
                .name(user.getName())
                .email(user.getEmail())
                .password(user.getPassword())
                .numberPhones(forListNumberPhone(user.getNumberPhones()))
                .addresses(forListAddress(user.getAddresses()))

                .build();
    }

    public List<NumberPhoneDTO> forListNumberPhone(List<NumberPhone> numberPhone){
        return numberPhone.stream().map(this::forNumberPhone).toList();
    }

    public NumberPhoneDTO forNumberPhone(NumberPhone numberPhone){
        return NumberPhoneDTO.builder()
                .ddd(numberPhone.getDdd())
                .number(numberPhone.getNumber())
                .build();
    }

    public List<AddressDTO> forListAddress (List<Address> address){
        return address.stream().map(this::forAddress).toList();
    }
    public  AddressDTO forAddress(Address address ){
        return AddressDTO.builder()
                .street(address.getStreet())
                .city(address.getCity())
                .state(address.getState())
                .number(address.getNumber())
                .complement(address.getComplement())
                .cep(address.getCep())

                .build();
    }
}
