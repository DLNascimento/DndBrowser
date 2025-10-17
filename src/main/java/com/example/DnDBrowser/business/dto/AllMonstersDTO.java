package com.example.DnDBrowser.business.dto;

import com.example.DnDBrowser.business.dto.response.Result;

import java.util.List;

public record AllMonstersDTO(
        int count,
        List<Result> results
) {
}
