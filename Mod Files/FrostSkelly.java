// Date: 9/6/2013 12:37:33 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class FrostSkelly extends ModelBase {
	//fields
    ModelRenderer Hat;
    ModelRenderer Head;
    ModelRenderer Body;
    ModelRenderer RightArm;
    ModelRenderer LeftArm;
    ModelRenderer RightLeg;
    ModelRenderer LeftLeg;
  
  public FrostSkelly()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      Hat = new ModelRenderer(this, 32, 0);
      Hat.addBox(-4F, -8F, -4F, 8, 8, 8);
      Hat.setRotationPoint(0F, 0F, 0F);
      Hat.setTextureSize(64, 32);
      Hat.mirror = true;
      setRotation(Hat, 0F, 0F, 0F);
      Head = new ModelRenderer(this, 0, 0);
      Head.addBox(-4F, -8F, -4F, 8, 8, 8);
      Head.setRotationPoint(0F, 0F, 0F);
      Head.setTextureSize(64, 32);
      Head.mirror = true;
      setRotation(Head, 0F, 0F, 0F);
      Body = new ModelRenderer(this, 16, 16);
      Body.addBox(0F, 0F, 0F, 8, 12, 4);
      Body.setRotationPoint(-4F, 0F, -2F);
      Body.setTextureSize(64, 32);
      Body.mirror = true;
      setRotation(Body, 0F, 0F, 0F);
      RightArm = new ModelRenderer(this, 40, 16);
      RightArm.addBox(-2F, 0F, -2F, 4, 10, 4);
      RightArm.setRotationPoint(-6F, 0F, 0F);
      RightArm.setTextureSize(64, 32);
      RightArm.mirror = true;
      setRotation(RightArm, 0F, 0F, 0F);

      LeftArm = new ModelRenderer(this, 40, 16);
      LeftArm.addBox(-2F, 0F, -2F, 4, 10, 4);
      LeftArm.setRotationPoint(6F, 0F, 0F);
      LeftArm.setTextureSize(64, 32);
      LeftArm.mirror = true;
      setRotation(LeftArm, 0F, 0F, 0F);
      LeftArm.mirror = false;
      RightLeg = new ModelRenderer(this, 0, 16);
      RightLeg.addBox(-2F, 0F, -2F, 4, 10, 4);
      RightLeg.setRotationPoint(-2F, 12F, 0F);
      RightLeg.setTextureSize(64, 32);
      RightLeg.mirror = true;
      setRotation(RightLeg, 0F, 0F, 0F);

      LeftLeg = new ModelRenderer(this, 0, 16);
      LeftLeg.addBox(-2F, 0F, -2F, 4, 10, 4);
      LeftLeg.setRotationPoint(2F, 12F, 0F);
      LeftLeg.setTextureSize(64, 32);
      LeftLeg.mirror = true;
      setRotation(LeftLeg, 0F, 0F, 0F);
      LeftLeg.mirror = false;
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Hat.render(f5);
    Head.render(f5);
    Body.render(f5);
    RightArm.render(f5);
    LeftArm.render(f5);
    RightLeg.render(f5);
    LeftLeg.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity par6Entity)
  {
    this.Head.rotateAngleY = f4 / (180 / (float)Math.PI);
    this.Head.rotateAngleX = f5 /(170 / (float)Math.PI);
    
    this.LeftLeg.rotateAngleX = MathHelper.cos(f * 0.6662F) * 2.0F * f1 * 0.5F;
    this.LeftLeg.rotateAngleY = 0.0F;
    
    this.RightLeg.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
    this.RightLeg.rotateAngleY = 0.0F;
    
    this.LeftArm.rotateAngleX = MathHelper.cos(f * 0.662F) * 2.0F * f1 * 0.5F;
    this.LeftArm.rotateAngleZ = 0.0F;
    
    this.RightArm.rotateAngleX = MathHelper.cos(f * 0.6663F + (float)Math.PI) * 2.0F * f1 * 0.5F;
    this.RightArm.rotateAngleZ = 0.0F;
  }

}
