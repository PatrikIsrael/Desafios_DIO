package onedigitalinnovation.santander_dev_week_2024.controller.dto;



public record FeatureDto(Long id, String icon, String description) {

    public FeatureDto(Taskbar.Feature model) {
        this(model.getId(), model.getIcon(), model.getDescription());
    }

    public Feature toModel() {
        Feature model = new Feature();
        model.setId(this.id);
        model.setIcon(this.icon);
        model.setDescription(this.description);
        return model;
    }
}

