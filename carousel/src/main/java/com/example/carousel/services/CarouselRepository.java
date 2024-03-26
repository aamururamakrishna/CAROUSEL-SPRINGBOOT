package com.example.carousel.services;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.carousel.models.Carousel;

public interface CarouselRepository extends JpaRepository<Carousel, Integer>{

}
