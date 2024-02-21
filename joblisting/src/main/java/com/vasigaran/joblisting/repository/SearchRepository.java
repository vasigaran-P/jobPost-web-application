package com.vasigaran.joblisting.repository;

import com.vasigaran.joblisting.model.Post;

import java.util.List;

public interface SearchRepository {
    List<Post> findByText(String text);
}
