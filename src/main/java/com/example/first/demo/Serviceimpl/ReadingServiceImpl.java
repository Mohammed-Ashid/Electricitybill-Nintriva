package com.example.first.demo.Serviceimpl;


import com.example.first.demo.Entity.Customer;
import com.example.first.demo.Entity.Reading;
import com.example.first.demo.Repository.ReadingRepository;

import com.example.first.demo.Repository.customerRepository;
import com.example.first.demo.Service.ReadingService;
import com.example.first.demo.Vo.ReadingVo;
import com.example.first.demo.mappers.ReadingMapper;


import lombok.RequiredArgsConstructor;


import org.springframework.stereotype.Service;


import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ReadingServiceImpl implements ReadingService {

    private final ReadingRepository readingRepository;

    private final customerRepository CustomerRepository;


@Override
public String newReading(ReadingVo read){



    {
        Optional<Customer> customerOptional = CustomerRepository.findById(read.getCustomerId());



        if (customerOptional.isEmpty())
        {

            return "Customer isn't Registered";
        }


    Optional<Reading> readings = readingRepository.findById(read.getReadingId());

        if (readings.isEmpty())
        {

            Reading r = ReadingMapper.toReading(read);
            readingRepository.save(r);

            return "New reading entry created successfully";
        }

        else
        {

            Reading existingReading = readings.get();
            double previousReading = existingReading.getCurrentReading();
            existingReading.setPreviousReading(previousReading);
            existingReading.setCurrentReading(read.getCurrentReading());
            existingReading.setReadingDate(read.getReadingDate());

            readingRepository.save(existingReading);

            return "Reading updated successfully";
        }

    }




    }
}
