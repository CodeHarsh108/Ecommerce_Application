    package com.ecommerce.project.service;

    import com.ecommerce.project.payload.ProductDTO;
    import com.ecommerce.project.payload.ProductResponse;
    import org.springframework.web.multipart.MultipartFile;

    import java.io.IOException;

    public interface ProductService {
        ProductDTO addProduct(ProductDTO productDTO, Long categoryId);

        ProductResponse searchByCategory(Long categoryId, Integer pageNumber, Integer pageSize, String sortBy, String sortOrder);

        ProductResponse getProductsByKeyword(String keyword, Integer pageNumber, Integer pageSize, String sortBy, String sortOrder);

        ProductDTO updateProduct(ProductDTO productDTO, Long productId);

        ProductDTO deleteProduct(Long productId);

        ProductDTO updateProductImage(Long productId, MultipartFile image) throws IOException;

        ProductResponse getAllProducts(Integer pageNumber, Integer pageSize, String sortBy, String sortOrder, String keyword, String category);

    }
