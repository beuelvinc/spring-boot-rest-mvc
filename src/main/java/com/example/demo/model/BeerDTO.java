package com.example.demo.model;

import lombok.Builder;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;


@Builder
public class BeerDTO {
    private UUID id;
    private Integer version;
    private String beerName;
    private BeerStyle beerStyle;
    private String upc;
    private BigDecimal price;
    private Integer quantityOnHand;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;

    public UUID getId() {
        return this.id;
    }

    public Integer getVersion() {
        return this.version;
    }

    public String getBeerName() {
        return this.beerName;
    }

    public BeerStyle getBeerStyle() {
        return this.beerStyle;
    }

    public String getUpc() {
        return this.upc;
    }

    public BigDecimal getPrice() {
        return this.price;
    }

    public Integer getQuantityOnHand() {
        return this.quantityOnHand;
    }

    public LocalDateTime getCreatedDate() {
        return this.createdDate;
    }

    public LocalDateTime getUpdatedDate() {
        return this.updatedDate;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public void setBeerName(String beerName) {
        this.beerName = beerName;
    }

    public void setBeerStyle(BeerStyle beerStyle) {
        this.beerStyle = beerStyle;
    }

    public void setUpc(String upc) {
        this.upc = upc;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setQuantityOnHand(Integer quantityOnHand) {
        this.quantityOnHand = quantityOnHand;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public void setUpdatedDate(LocalDateTime updatedDate) {
        this.updatedDate = updatedDate;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof BeerDTO)) return false;
        final BeerDTO other = (BeerDTO) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$version = this.getVersion();
        final Object other$version = other.getVersion();
        if (this$version == null ? other$version != null : !this$version.equals(other$version)) return false;
        final Object this$beerName = this.getBeerName();
        final Object other$beerName = other.getBeerName();
        if (this$beerName == null ? other$beerName != null : !this$beerName.equals(other$beerName)) return false;
        final Object this$beerStyle = this.getBeerStyle();
        final Object other$beerStyle = other.getBeerStyle();
        if (this$beerStyle == null ? other$beerStyle != null : !this$beerStyle.equals(other$beerStyle)) return false;
        final Object this$upc = this.getUpc();
        final Object other$upc = other.getUpc();
        if (this$upc == null ? other$upc != null : !this$upc.equals(other$upc)) return false;
        final Object this$price = this.getPrice();
        final Object other$price = other.getPrice();
        if (this$price == null ? other$price != null : !this$price.equals(other$price)) return false;
        final Object this$quantityOnHand = this.getQuantityOnHand();
        final Object other$quantityOnHand = other.getQuantityOnHand();
        if (this$quantityOnHand == null ? other$quantityOnHand != null : !this$quantityOnHand.equals(other$quantityOnHand))
            return false;
        final Object this$createdDate = this.getCreatedDate();
        final Object other$createdDate = other.getCreatedDate();
        if (this$createdDate == null ? other$createdDate != null : !this$createdDate.equals(other$createdDate))
            return false;
        final Object this$updatedDate = this.getUpdatedDate();
        final Object other$updatedDate = other.getUpdatedDate();
        if (this$updatedDate == null ? other$updatedDate != null : !this$updatedDate.equals(other$updatedDate))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof BeerDTO;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $version = this.getVersion();
        result = result * PRIME + ($version == null ? 43 : $version.hashCode());
        final Object $beerName = this.getBeerName();
        result = result * PRIME + ($beerName == null ? 43 : $beerName.hashCode());
        final Object $beerStyle = this.getBeerStyle();
        result = result * PRIME + ($beerStyle == null ? 43 : $beerStyle.hashCode());
        final Object $upc = this.getUpc();
        result = result * PRIME + ($upc == null ? 43 : $upc.hashCode());
        final Object $price = this.getPrice();
        result = result * PRIME + ($price == null ? 43 : $price.hashCode());
        final Object $quantityOnHand = this.getQuantityOnHand();
        result = result * PRIME + ($quantityOnHand == null ? 43 : $quantityOnHand.hashCode());
        final Object $createdDate = this.getCreatedDate();
        result = result * PRIME + ($createdDate == null ? 43 : $createdDate.hashCode());
        final Object $updatedDate = this.getUpdatedDate();
        result = result * PRIME + ($updatedDate == null ? 43 : $updatedDate.hashCode());
        return result;
    }

    public String toString() {
        return "Beer(id=" + this.getId() + ", version=" + this.getVersion() + ", beerName=" + this.getBeerName() + ", beerStyle=" + this.getBeerStyle() + ", upc=" + this.getUpc() + ", price=" + this.getPrice() + ", quantityOnHand=" + this.getQuantityOnHand() + ", createdDate=" + this.getCreatedDate() + ", updatedDate=" + this.getUpdatedDate() + ")";
    }
}
