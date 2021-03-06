package com.example.administrator.rxjavaretrofitdemo.entity;

import java.util.List;

/**
 * Created by liuji on 2016/5/20.
 */
public class Subject {
    private ImagesEntity images;
    private List<CastsEntity> casts;
    private String original_title;
    private String subtype;
    private String year;
    private List<String> genres;
    private List<DirectorsEntity> directors;
    private RatingEntity rating;
    private String alt;
    private String id;
    private String title;
    private int collect_count;

    public void setImages(ImagesEntity images) {
        this.images = images;
    }

    public void setCasts(List<CastsEntity> casts) {
        this.casts = casts;
    }

    public void setOriginal_title(String original_title) {
        this.original_title = original_title;
    }

    public void setSubtype(String subtype) {
        this.subtype = subtype;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setGenres(List<String> genres) {
        this.genres = genres;
    }

    public void setDirectors(List<DirectorsEntity> directors) {
        this.directors = directors;
    }

    public void setRating(RatingEntity rating) {
        this.rating = rating;
    }

    public void setAlt(String alt) {
        this.alt = alt;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCollect_count(int collect_count) {
        this.collect_count = collect_count;
    }

    public ImagesEntity getImages() {
        return images;
    }

    public List<CastsEntity> getCasts() {
        return casts;
    }

    public String getOriginal_title() {
        return original_title;
    }

    public String getSubtype() {
        return subtype;
    }

    public String getYear() {
        return year;
    }

    public List<String> getGenres() {
        return genres;
    }

    public List<DirectorsEntity> getDirectors() {
        return directors;
    }

    public RatingEntity getRating() {
        return rating;
    }

    public String getAlt() {
        return alt;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getCollect_count() {
        return collect_count;
    }

    public static class ImagesEntity {
        private String small;
        private String large;
        private String medium;

        public void setSmall(String small) {
            this.small = small;
        }

        public void setLarge(String large) {
            this.large = large;
        }

        public void setMedium(String medium) {
            this.medium = medium;
        }

        public String getSmall() {
            return small;
        }

        public String getLarge() {
            return large;
        }

        public String getMedium() {
            return medium;
        }
    }

    public static class CastsEntity {
        private String alt;
        private String name;
        private String id;
        private AvatarsEntity avatars;

        public void setAlt(String alt) {
            this.alt = alt;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setId(String id) {
            this.id = id;
        }

        public void setAvatars(AvatarsEntity avatars) {
            this.avatars = avatars;
        }

        public String getAlt() {
            return alt;
        }

        public String getName() {
            return name;
        }

        public String getId() {
            return id;
        }

        public AvatarsEntity getAvatars() {
            return avatars;
        }

        public static class AvatarsEntity {
            private String small;
            private String large;
            private String medium;

            public void setSmall(String small) {
                this.small = small;
            }

            public void setLarge(String large) {
                this.large = large;
            }

            public void setMedium(String medium) {
                this.medium = medium;
            }

            public String getSmall() {
                return small;
            }

            public String getLarge() {
                return large;
            }

            public String getMedium() {
                return medium;
            }
        }
    }

    public static class DirectorsEntity {
        private String alt;
        private String name;
        private String id;
        private AvatarsEntity avatars;

        public void setAlt(String alt) {
            this.alt = alt;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setId(String id) {
            this.id = id;
        }

        public void setAvatars(AvatarsEntity avatars) {
            this.avatars = avatars;
        }

        public String getAlt() {
            return alt;
        }

        public String getName() {
            return name;
        }

        public String getId() {
            return id;
        }

        public AvatarsEntity getAvatars() {
            return avatars;
        }

        public static class AvatarsEntity {
            private String small;
            private String large;
            private String medium;

            public void setSmall(String small) {
                this.small = small;
            }

            public void setLarge(String large) {
                this.large = large;
            }

            public void setMedium(String medium) {
                this.medium = medium;
            }

            public String getSmall() {
                return small;
            }

            public String getLarge() {
                return large;
            }

            public String getMedium() {
                return medium;
            }
        }
    }

    public static class RatingEntity {
        private double average;
        private int min;
        private int max;
        private String stars;

        public void setAverage(double average) {
            this.average = average;
        }

        public void setMin(int min) {
            this.min = min;
        }

        public void setMax(int max) {
            this.max = max;
        }

        public void setStars(String stars) {
            this.stars = stars;
        }

        public double getAverage() {
            return average;
        }

        public int getMin() {
            return min;
        }

        public int getMax() {
            return max;
        }

        public String getStars() {
            return stars;
        }
    }
}
